package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public _01Servlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 값
		int iVal = 10;
		long lVal = 1234567890;
		float fVal = 3.14f;
		boolean bVal = true;
		String sVal = "가\n나\n다\n라\n마\n바";
		
		
		// 객체
		Object obj = null;
		UserVo vo = new UserVo();
		vo.setNo(10L);
		vo.setName("강성호");
		
		// map
		Map<String, Object> map = new HashMap<>();
		map.put("i",iVal);
		map.put("l",lVal);
		map.put("s",sVal);
		
		request.setAttribute("iVal",iVal);
		request.setAttribute("lVal",lVal);
		request.setAttribute("fVal",fVal);
		request.setAttribute("bVal",bVal);
		request.setAttribute("sVal",sVal);
		
		request.setAttribute("userVo",vo);
		
		request.setAttribute("obj",obj);
		request.setAttribute("map",map);
		
		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
