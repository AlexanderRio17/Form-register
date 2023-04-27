<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="Login.css">

   
  <script>  
  function validateform(){  
  var id=document.form.stuid.value;  
  var password=document.form.password.value;  
    
  if (id==null || id==""){  
    alert("Student_Id can't be blank");  
    return false;  
  }if(password==null || password=="")
	  {
	  alert("Password can't be blank");  
	    return false; 
	  }
  else if(password.length<6){  
    alert("Password must be at least 6 characters long.");  
    return false;  
    }  
  }  
  </script>  

</head>	
<body>

 <div class="login1">
 
		<form name="form" method="post" action="Loginservlet" onsubmit="return validateform()" >  
            <h1>Login Page</h1>
            <div class="input" >
                <label for="User Name">Student Id</label>
                <input type="text" placeholder="Enter the Id"  name="stuid" >
                
            </div>
            
            <div class="input" >
                <label for="Password">Password</label>
                <input type="password" placeholder="Enter the possword" id="password" name="password">
               
            </div>
            
            <button type="submit" >Login</button>

            
                
            
        </form>

    </div>
</body>

</html>