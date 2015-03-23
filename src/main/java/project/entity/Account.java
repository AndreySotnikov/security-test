//package project.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
///**
// * Created by andrey on 23.03.15.
// */
//@Entity
//public class Account {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    Integer id;
//    String username;
//    String password;
//
//    public Account() {
//    }
//
//    public Account(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Account account = (Account) o;
//
//        if (password != null ? !password.equals(account.password) : account.password != null) return false;
//        if (username != null ? !username.equals(account.username) : account.username != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = username != null ? username.hashCode() : 0;
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//}
