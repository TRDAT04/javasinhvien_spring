/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author LNV
 */
public class TaiKhoan {

    private String username;
    private String password;
    private String role;
    private String hoten;

    public TaiKhoan() {
    }

    public TaiKhoan(String username, String password, String role, String hoten) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.hoten = hoten;
    }

    // Getter và Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

}
