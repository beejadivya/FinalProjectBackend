package com.knf.dev.models;
import javax.persistence.*;

@Entity
@Table
public class Cart {

    @Id
    @SequenceGenerator(name="cart_sequence",
            sequenceName = "cart_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "cart_sequence"
    )
    private Long id;
    private String product_name;
    private int price;
private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cart(Long id, String product_name, int price,String image) {
        this.id = id;
        this.product_name = product_name;
        this.price = price;
        this.image=image;
    }

    public Cart(){
        super();
    }


}