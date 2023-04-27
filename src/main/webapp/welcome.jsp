<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
    function Validate() {
        var ddlFruits = document.getElementById("ddlFruits");
        if (ddlFruits.value == "") {
            //If the "Please Select" option is selected display error.
            alert("Please select an option!");
            return false;
        }
       
    }
</script>
</head>
<body>
<h2>Welcome</h2>
Select Fruit:
<select id="ddlFruits">
    <option value=""></option>
    <option value="1">Apple</option>
    <option value="2">Mango</option>
    <option value="3">Orange</option>
</select>
<input type="submit" value="Validate" onclick="return Validate()" />

</body>
</html>