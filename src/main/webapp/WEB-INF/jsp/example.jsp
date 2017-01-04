<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>An example JSP</title>
  </head>
  <body>
  <h1>JSP</h1>
  <fmt:message key="time.is"/>&nbsp;<fmt:formatDate value="${now}" type="both"/>
  </body>
</html>
