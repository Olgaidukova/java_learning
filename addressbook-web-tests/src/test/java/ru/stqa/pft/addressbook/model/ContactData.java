package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public record ContactData(String firstname, String lastname, String address, String email, String phone) {
    @Override
    public String toString() {
        return "ContactData{" +
                "firstname='" + firstname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        return Objects.equals(firstname, that.firstname);
    }

    @Override
    public int hashCode() {
        return firstname != null ? firstname.hashCode() : 0;
    }
}