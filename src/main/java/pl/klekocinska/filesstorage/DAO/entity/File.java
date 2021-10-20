package pl.klekocinska.filesstorage.DAO.entity;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "files")
public class File {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String creator;
    private LocalDate createDate;
    private int size;

    public File(Long id, String name, String creator, LocalDate createDate, int size) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
        this.size = size;
    }


    public File() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
