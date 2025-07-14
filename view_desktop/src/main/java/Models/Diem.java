/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author LNV
 */
public class Diem {

    private DiemId id;
    private Double diem;

    public Diem() {
    }

    public Diem(DiemId id, Double diem) {
        this.id = id;
        this.diem = diem;
    }

    public DiemId getId() {
        return id;
    }

    public void setId(DiemId id) {
        this.id = id;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }
}
