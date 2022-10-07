import React, { useState, useEffect } from "react";
import { Outlet, Link, useNavigate } from "react-router-dom";
import './Product.css';
import axios from "axios";

const Product = () => {

  const [product, setProduct] = useState([]);
  const [error, setError] = useState(null);
  

  useEffect(() => {
    fetch("http://localhost:8080/api/auth/product_details")
      .then(res => res.json())
      .then(
        (result) => {
          console.log('called get items')
          console.log(result)
          setProduct(result);
        },
        (error) => {
          setError(error);
        }
      )
  }, [])

  const saveProduct =(data)=>{

    axios.post("http://localhost:8080/api/auth/add_product",data)

    .then((response) => {

      console.log(response)

    })

    .catch((error)=>{

      console.log(error)



    })

    }

  return (
    <div className="Product">
      <h1 className="ProductHeading">Ghee & Oils</h1>
      <div className="ProductPageContainer">
        <div className="filterContainer">
          {/* <button>Filter</button> */}
        </div>
        <div className="productList">
          {product &&
            product.map((Product) => {
              return (
                <div key={Product.id} className="productCard">
                  <img
                    src={Product.image}
                    className="productImage"
                    width={150} height={150}
                  />
                  <div>
                    {Product.product_name} - Rs. {Product.price}/-
                  </div>
                  
                  <Link to="/cart" Product={product} > 
                  {/* <button type="button" class="button">Add to Cart</button>  */}
                  
                  {/* <button onClick={()=> saveProduct} >Add To Cart</button> */}
                  <button onClick={saveProduct}> Add to Cart</button>
                  </Link>
                  
                  
                  
                </div>
              );
            })}
        </div>
      </div>
    </div>
  );
};

export default Product;




