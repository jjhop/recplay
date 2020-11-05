import java.sql.ResultSet;

public class UserDbMapper {

    public User map(ResultSet rs, int row) throws Exception {
        return new User(
                rs.getLong("id"),
                rs.getString("name")
        );
    }
}
