package demo;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> lines = new ArrayList<String>();

        lines.add("RequestURL: " + req.getRequestURL());

        lines.add("Scheme: " + req.getScheme());
        lines.add("Protocol: " + req.getProtocol());
        lines.add("ContextPath: " + req.getContextPath());
        lines.add("ServletPath: " + req.getServletPath());
        lines.add("Method: " + req.getMethod());
        lines.add("PathInfo: " + req.getPathInfo());

        lines.add("QueryString: " + req.getQueryString());
        lines.add("------------------ parameters ------------------");
        Enumeration parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = (String) parameterNames.nextElement();
            String value = req.getParameter(name);
            lines.add(name + ": " + value);
        }

        lines.add("RequestedSessionId: " + req.getRequestedSessionId());
        lines.add("CharacterEncoding: " + req.getCharacterEncoding());
        lines.add("ContentType: " + req.getContentType());

        lines.add("RemoteUser: " + req.getRemoteUser());
        lines.add("RemoteAddr: " + req.getRemoteAddr());
        lines.add("RemotePort: " + req.getRemotePort());
        lines.add("RemoteHost: " + req.getRemoteHost());

        lines.add("LocalAddr: " + req.getLocalAddr());
        lines.add("LocalName: " + req.getLocalName());
        lines.add("LocalPort: " + req.getLocalPort());

        lines.add("ServerName: " + req.getServerName());

        lines.add("----------------- headers ------------------");
        Enumeration headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            String value = req.getHeader(headerName);
            lines.add(headerName + ": " + value);
        }

        lines.add("----------------- cookies ------------------");
        for (Cookie cookie : req.getCookies()) {
            lines.add(cookie.getName() + ": " + cookie.getValue());
        }

        for (String line : lines) {
            resp.getWriter().append("<div>" + line + "</div>");
        }

    }

}
