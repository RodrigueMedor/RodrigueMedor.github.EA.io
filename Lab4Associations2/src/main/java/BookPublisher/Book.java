package BookPublisher;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Title", nullable = false)
    public String title;

    @Column(name = "Author", nullable = false)
    public String author;

    @Column(name = "Year", nullable = false)
    public LocalDate year;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition="integer", name="publisher_id")
    public Publisher publisher;

    @Column(name = "ISBN", nullable = false)
    private String ISBN;

    @Column(name = "cost", nullable = false)
    public double cost;

    public Book(String title, String author, LocalDate year, String ISBN, double cost) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = new Publisher();
        this.ISBN = ISBN;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
