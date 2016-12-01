Get Request Info in Servlet Demo
===============================

How to get request information in a servlet.

```
mvn jetty:run
```

Then visit <http://localhost:8080/mycontext/hello/world?name=111>, and see the information on the page.

```
RequestURL: http://localhost:8080/mycontext/hello/world
Scheme: http
Protocol: HTTP/1.1
ContextPath: /mycontext
ServletPath: /hello
Method: GET
PathInfo: /world
QueryString: name=111
------------------ parameters ------------------
name : 111
RequestedSessionId: oty91ifwybfe1cyfexanc6gou
CharacterEncoding: null
ContentType: null
RemoteUser: null
RemoteAddr: 0:0:0:0:0:0:0:1
RemotePort: 58602
RemoteHost: 0:0:0:0:0:0:0:1
LocalAddr: 0:0:0:0:0:0:0:1
LocalName: 0:0:0:0:0:0:0:1
LocalPort: 8080
ServerName: localhost
```

Note:
- `contextPath` is defined in `pom.xml`


