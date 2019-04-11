<%--
  Created by IntelliJ IDEA.
  User: admin1
  Date: 11/04/2019
  Time: 08:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculate</title>
  </head>
  <style type="text/css">
    .calculate{
      height: 300px;width: 400px;
      margin: 0;
      padding: 10px;
      border: 1px #CCCCCC solid;
    }
    .calculate input{
      padding: 5px;margin: 5px;
    }
  </style>
  <body>
  <form method="post" action="./calculator">
    <div class="calculate">
      <h1>Product Discount Calculator</h1>
      <label>
        ProductDescription
        <br/>
        <input type="text" size="30" name="ProductDescription" placeholder="Description"/>
        <br/>
        ListPrice
        <br/>
        <input type="text" size="30" name="ListPrice" placeholder="Price"/>
        <br/>
        DiscountPercent
        <br/>
        <input type="text" size="30" name="DiscountPercent" placeholder="DiscountPercent"/>
        <br/>
        <input type="submit" value="Calculate Discount"/>
      </label>
    </div>
  </form>
  </body>
</html>
