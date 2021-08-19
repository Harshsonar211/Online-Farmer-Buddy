<%-- 
    Document   : success
    Created on : 18 Mar, 2021, 11:06:12 PM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head>
    <link href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,400i,700,900&display=swap" rel="stylesheet">
  </head>
    <style>
      body {
        text-align: center;
        padding: 40px 0;
        background: #EBF0F5;
      }
        h1 {
          color: #88B04B;
          font-family: "Nunito Sans", "Helvetica Neue", sans-serif;
          font-weight: 900;
          font-size: 40px;
          margin-bottom: 10px;
        }
        p {
          color: #404F5E;
          font-family: "Nunito Sans", "Helvetica Neue", sans-serif;
          font-size:20px;
          margin: 0;
        }
      i {
        color: #9ABC66;
        font-size: 200px;
        line-height: 400px;
        margin-left:-20px;
        
      }
      .card {
        background: white;
        padding: 60px;
        width:500px;
        border-radius: 4px;
        box-shadow: 0 2px 3px #C8D0D8;
        display: inline-block;
        margin: 0 auto;
      }
      .btn-success
      {
   margin-top: 50px;
  background-color: #4CAF50;
  color: white;
  padding: 15px;
  margin: 10px 0;
  border: none;
  width: 15%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 18px;
      }
    </style>
    <body>
      <div class="card">
      <div style="border-radius:400px; height:400px; width:400px; background: #F8FAF5; margin:0 auto;">
        <i class="checkmark">✓</i>
      </div>
        <h1>Success</h1> 
        <p>We received your purchase request;<br/> we'll be in touch shortly!</p>
      </div>
        <div clASS="footer-btn-primary">
            <center><a href="index.jsp"><button type="button" class="btn-success">Ok</button></a></center>
</div>
    </body>
</html>