/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Models.TaiKhoan;
import java.io.IOException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

/**
 *
 * @author LNV
 */
public class AuthService {

    public TaiKhoan login(String username, String password) throws IOException {
        URL url = new URL("http://localhost:8080/api/auth/login");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String json = String.format("{\"username\":\"%s\", \"password\":\"%s\"}", username, password);
        try (OutputStream os = conn.getOutputStream()) {
            os.write(json.getBytes("utf-8"));
        }

        if (conn.getResponseCode() == 200) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }

                return new Gson().fromJson(response.toString(), TaiKhoan.class);
            }
        } else {
            return null;
        }
    }
}
