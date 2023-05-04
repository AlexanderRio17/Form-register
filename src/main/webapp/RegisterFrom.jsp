<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
<link rel="stylesheet" href="Register.css">

<script>  
  function validateform(){  
  var name=document.form.fname.value;  
  var id=document.form.Id.value; 
  var email=document.form.email.value;
  var mobile=document.form.mobile.value;
  var address=document.form.address.value;
  

    
  if (name==null || name==""){  
    alert("Student_Name can't be blank");  
    return false; 
  }
  if (id==null || id==""){  
	    alert("Student_Id can't be blank");  
	    return false; 
	  }
  if (email==null || email==""){  
	    alert("Email_Id can't be blank");  
	    return false; 
	  }
  if (mobile==null || mobile==""){  
	    alert("Mobile can't be blank");  
	    return false; 
	  }

  
  if (address==null || address==""){  
	    alert("Address can't be blank");  
	    return false; 
	  }
 
  }
  </script>
  
</head>
<body>

<body>
    <div class="Reg">
      
    <form name="form" method="post" action="Insert" onsubmit="return validateform()" >
        <h2> Student Registration Form</h2>
        <table>
            <div class="input" >

            <tr>
                <td><label> Student_Name: </label></td>
                <td>
                    <input type="text" name="fname" id="name" placeholder=" Student_Name">
                </td>
            </tr>
            </div>
            <div class="input" >

            <tr>
                <td><label>Student Id: </label></td>
                <td>
                    <input type="text" name="Id"  id="studentid" placeholder="Student_id">
                </td>
            </tr>
            </div>
           
            <div class="input" >

            <tr>
                <td><label>Email Id: </label></td>
                <td>
                    <input type="text" name="email"  id="email" placeholder="example@gmail.com">
                </td>
            </tr>
            </div>
            <div class="input" >

            <tr>
                <td><label>Mobile: </label></td>
                <td>
                    <input type="text"  id="mobile" name="mobile">
                </td>
            </tr>
            </div>
            
            <div class="input" >

            <tr>
                <td><label>Address: </label></td>
                <td>
                    <input type="textarea" size="50" id="address" name="address" placeholder="Address">
                </td>
            </tr>
            </div>
            
            
            
            

            
        </table>
         			<button type="submit" >Register</button>
                    <button type="reset" >Cancel</button>
        
    </form>
</div>

</body>
</html>