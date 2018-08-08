import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
//@Table (name = "MYTEST")
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int number;
    private String UserName;
    @ElementCollection
    @JoinTable(name = "STUDENT_ADDRESS" ,
            joinColumns = @JoinColumn(name = "Student_ID")
   )
    @GenericGenerator(name="increment-gen",strategy="increment")
    @CollectionId(columns = {@Column(name = "ADDRESS_ID")},generator = "increment-gen" , type =@Type( type = "long"))
    private Collection<Address> listofAddresses = new ArrayList<Address>();

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

    public Collection<Address> getListofAddresses() {
        return listofAddresses;
    }

    public void setListofAddresses(Set<Address> listofAddresses) {
        this.listofAddresses = listofAddresses;
    }
}
