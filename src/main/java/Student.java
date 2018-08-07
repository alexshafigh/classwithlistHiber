import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "MYTEST")
public class Student {
    @Id
    private int number;

    private String UserName;

    @ElementCollection
    private Set<Address> listofAddresses = new HashSet<Address>();

    public Student() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Set<Address> getListofAddresses() {
        return listofAddresses;
    }

    public void setListofAddresses(Set<Address> listofAddresses) {
        this.listofAddresses = listofAddresses;
    }
}
