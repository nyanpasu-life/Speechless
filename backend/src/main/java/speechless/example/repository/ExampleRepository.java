package speechless.example.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ExampleRepository {

    private final DataSource dataSource;

    public String getTest() throws Exception {
        String query = "SELECT 1 FROM dual";

        Connection con = dataSource.getConnection();
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery(query);

        if (!rs.next()) {
            throw new Exception("fail");
        }
        return rs.getString(1);
    }

}
