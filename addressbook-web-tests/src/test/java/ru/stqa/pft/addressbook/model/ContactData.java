package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
import java.util.Objects;

@XStreamAlias("contact")
@Entity
@Table(name = "addressbook")
public class ContactData {
    @XStreamOmitField
    @Id
    @Column(name = "id")
    private int id = Integer.MAX_VALUE;
    @Expose
    @Column(name = "firstname")
    private String firstname;
    @Expose
    @Column(name = "lastname")
    private String lastname;
    @Expose
    @Column(name = "address")
    @Type(type = "text")
    private String address;
    @Expose
    @Column(name = "email")
    @Type(type = "text")
    private String email;
    @Transient
    private String phone;
    @Column(name = "home")
    @Type(type = "text")
    private String home;
    @Column(name = "work")
    @Type(type = "text")
    private String work;
    @Expose
    @Column(name = "mobile")
    @Type(type = "text")
    private String mobile;
    @Transient
    private String allPhones;
    @Transient
    @Type(type = "text")
    private String email1;
    @Transient
    @Type(type = "text")
    private String email2;
    @Transient
    @Type(type = "text")
    private String email3;
    @Transient
    private String allEmail;
    @Column(name = "photo")
    @Type(type = "text")
    private String photo;

    public File getPhoto() {
        return new File(photo);
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo.getPath();
        return this;
    }

    public String getAllPhones() {
        return allPhones;
    }





    public int getId() {
        return id;
    }


    public ContactData withId(int id) {
        this.id = id;
        return this;
    }
    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData withEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactData withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactData withHomePhone(String home) {
        this.home = home;
        return this;
    }

    public ContactData withMobilePhone(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public ContactData withWorkPhone(String work) {
        this.work = work;
        return this;
    }
    public ContactData withEmail1(String email1) {
        this.email1 = email1;
        return this;
    }
    public ContactData withEmail2(String email2) {
        this.email2 = email2;
        return this;
    }
    public ContactData withEmail3(String email3) {
        this.email3 = email3;
        return this;
    }
    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }

    public ContactData withAllEmail(String allEmail) {
        this.allEmail = allEmail;
        return this;
    }



    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    public String getMobilePhone() {
        return mobile;
    }
    public String getHomePhone() {
        return home;
    }

    public String getWorkPhone() {
        return work;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }
    public String getEmail3() {
        return email3;
    }
    public String getAllEmail() {
        return allEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (id != that.id) return false;
        if (!Objects.equals(firstname, that.firstname)) return false;
        return Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }



}