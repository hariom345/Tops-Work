<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="StudentSrevelet" method="post">
  <table>
      <tr>
          <td>First Name</td>
          <td>
            <input type="text" name="fname">
           </td>
       </tr>
       <tr>
           <td>Last Name</td>
           <td>
              <input type="text" name="lname">
           </td>
       </tr>
       <tr>
          <td>Email </td>
          <td>
              <input type="email" name="email">
           </td>
      </tr>
      <tr>
          <td>Password</td>
          <td>
              <input type="password" name="password">
          </td>
     </tr>
      <tr>
          <td>Contact</td>
          <td>
                <input type="number" name="contact">
           </td>
   </tr>
   <tr>
           <td>Gender</td>
           <td>
              <input type="radio" name="gender">Male
              <input type="radio" name="gender">Female
          </td>
  </tr>
   <tr>
          <td>Address</td>
          <td>
              <textarea rows="10" cols="25" name="address"> Enter Your Text Here</textarea>
          </td>
  </tr>
  <tr>
         <td>
            <input type="submit" value="Register">
          </td>

  </tr>


   </table>

</form>

</body>
</html>