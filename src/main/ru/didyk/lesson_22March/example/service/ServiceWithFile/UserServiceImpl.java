package ru.didyk.lesson_22March.example.service.ServiceWithFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.didyk.example.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final String filename = "users.txt";
    private ObjectMapper objectMapper;

    @Autowired
    public UserServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public User addUser(User user) {
        String userToFile = null;
        try {
            userToFile = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true))) {
            bufferedWriter.write(userToFile);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User getByAccount(String account) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                User user = objectMapper.readValue(str, User.class);
                if (user.getAccount().equals(account)) {
                    return user;
                } else {
                    System.out.println("User not found");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                User user = objectMapper.readValue(str, User.class);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User updateUser(User user) {
        List<User> users = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true))) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                User newUser = objectMapper.readValue(str, User.class);
                if (newUser.getAccount().equals(user.getAccount())) {
                    newUser.setName(user.getName());
                    newUser.setAccount(user.getAccount());
                    newUser.setSurname(user.getSurname());
                    users.add(newUser);
                } else {
                    users.add(newUser);
                }
            }
            try (BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(filename, false))) {
                String userToFile = "";
                for (int i = 0; i < users.size(); i++) {
                    userToFile = objectMapper.writeValueAsString(users.get(i));
                    bufferedWriter.write(userToFile);
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteUser(String account) {
        List<User> users = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true))) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                User user = objectMapper.readValue(str, User.class);
                if (!user.getAccount().equals(account)) {
                    users.add(user);
                }
            }
            try (BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(filename, false))) {
                String userToFile = "";
                for (int i = 0; i < users.size(); i++) {
                    userToFile = objectMapper.writeValueAsString(users.get(i));
                    bufferedWriter.write(userToFile);
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
