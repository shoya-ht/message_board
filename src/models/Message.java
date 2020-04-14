package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@NamedQueries({
    @NamedQuery(
            name="getAllMessages",
            query="SELECT m FROM Message AS m ORDER BY m.id DESC"
            )
})
@Table(name="messages")
public class Message {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="titile",length=225,nullable=false)
    private String title;

    @Column(name="content",length=225,nullable=false)
    private String content;

    @Column(name="created_at",nullable=false)
    private String created_at;

    @Column(name="updated_at",nullable=false)
    private String updated_at;

    public Integer getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
