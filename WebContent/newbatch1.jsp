<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addbatch" method="get">


     	<div class="field">
             <label>StartDate:</label> <input type="text" name="startdate">


         </div>
    
         <div class="field">
               <label> EndDate:</label>	<input type="text" name="enddate">

         </div>

         <div class="field">
               <label>Price:</label><input type="number" name="price">
         </div>
		
           <div class="field">
         
                <input type="submit" value="Add" class="button1">

         </div>
	 
</form>
</body>
</html>