package common;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// 데이터 베이스의 접근을 위한 연동이 필요한데,
// 이 파일이 연동을 위한 connection tool의 일부가 된다.
// common은 일반적인 도구가 들어가는 패키지이다.


public class JdbcUtil {
	private static JdbcUtil instance = new JdbcUtil();
	// 자바의 데이터 소스를 불러오게 하려고
	
	private static DataSource ds;
		
	static {
		try {
			// 오라클 드라이버 파일을 찾아와라
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			System.out.println("Connection Pool  성공");
		}catch (ClassNotFoundException e) {
			// 만약 못 찾았으면 에러를 확인할거야
			e.printStackTrace();
		}catch(NamingException e){
			e.printStackTrace();
		}
	}
	
	private JdbcUtil() {}
	
	public static JdbcUtil getInstance() {
		// 객체가 필요하면 이걸 불러서 인스턴스를 반환한다.
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
//		여기서 리턴값은 데이터베이스의 커넥션을 리턴해야 함
		return ds.getConnection(); //풀에서 커넥션 반환
	}
	
}
