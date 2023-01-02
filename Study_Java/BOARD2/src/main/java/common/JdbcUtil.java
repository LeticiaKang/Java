package common;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

// ������ ���̽��� ������ ���� ������ �ʿ��ѵ�,
// �� ������ ������ ���� connection tool�� �Ϻΰ� �ȴ�.
// common�� �Ϲ����� ������ ���� ��Ű���̴�.


public class JdbcUtil {
	private static JdbcUtil instance = new JdbcUtil();
	// �ڹ��� ������ �ҽ��� �ҷ����� �Ϸ���
	
	private static DataSource ds;
		
	static {
		try {
			// ����Ŭ ����̹� ������ ã�ƿͶ�
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			System.out.println("Connection Pool  ����");
		}catch (ClassNotFoundException e) {
			// ���� �� ã������ ������ Ȯ���Ұž�
			e.printStackTrace();
		}catch(NamingException e){
			e.printStackTrace();
		}
	}
	
	private JdbcUtil() {}
	
	public static JdbcUtil getInstance() {
		// ��ü�� �ʿ��ϸ� �̰� �ҷ��� �ν��Ͻ��� ��ȯ�Ѵ�.
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
//		���⼭ ���ϰ��� �����ͺ��̽��� Ŀ�ؼ��� �����ؾ� ��
		return ds.getConnection(); //Ǯ���� Ŀ�ؼ� ��ȯ
	}
	
}
