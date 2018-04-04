import java.sql.*;          
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBManager {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/admission";
    private static final String DBUSER = "root";
    private static final String DBPASSWORD = "shishir@10";
    
    static{
        try{
            Class.forName(DBDRIVER);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Unable to load MySql Driver\nCan not Continue", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    public static boolean authenticateUser(String userName, String passwd){
        boolean status = false;
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("select * from users where UserName=? and Passwd =?");
            st.setString(1, userName);
            st.setString(2, passwd);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                status = true;
            }
            rs.close();
        }
        catch(Exception ex){            
        }    
        return status;
    } 
    public static String getRole(String userName){
        String roleName = "";
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("select RoleName from users where UserName=?");
            st.setString(1, userName);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                roleName = rs.getString(1);
            }
            rs.close();
        }
        catch(Exception ex){            
        }    
        return roleName;
    } 
    public static String getName(String userName){
        String name = "";
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("select Name from users where UserName=?");
            st.setString(1, userName);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                name = rs.getString(1);
            }
            rs.close();
        }
        catch(Exception ex){            
        }    
        return name;
    } 
   public static boolean insertStudent(int rollNumber, String name, String gender, String email, String mobileNumber, String course){
        boolean status = false;
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("insert into students values(?,?,?,?,?,?)");
            st.setInt(1, rollNumber);
            st.setString(2, name);
            st.setString(3, gender);
            st.setString(4, email);
            st.setString(5, mobileNumber);
            st.setString(6, course);           
            st.executeUpdate();
            status = true;
        }
        catch(Exception ex){            
        }    
        return status;
    }
    public static boolean insertStudent(Student s){
        boolean status = false;
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("insert into students values(?,?,?,?,?,?)");
            st.setInt(1, s.getRollNumber());
            st.setString(2, s.getName());
            st.setString(3, s.getGender());
            st.setString(4, s.getEmail());
            st.setString(5, s.getMobileNumber());
            st.setString(6, s.getCourse());           
            st.executeUpdate();
            status = true;
        }
        catch(Exception ex){            
        }    
        return status;
    }
    public static boolean updateStudent(Student s){
        boolean status = false;
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("update students set Name=?, Gender=?, Email=?, MobileNumber=?, Course=? where rollNumber=?");            
            st.setString(1, s.getName());
            st.setString(2, s.getGender());
            st.setString(3, s.getEmail());
            st.setString(4, s.getMobileNumber());
            st.setString(5, s.getCourse());  
            st.setInt(6, s.getRollNumber());
            st.executeUpdate();
            status = true;
        }
        catch(Exception ex){            
        }    
        return status;
    }    
    public static boolean deleteStudent(int rollNumber){
        boolean status = false;
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("delete from students where rollNumber=?");             
            st.setInt(1, rollNumber);
            st.executeUpdate();
            status = true;
        }
        catch(Exception ex){            
        }    
        return status;
    }     
    public static Student getStudent(int rollNumber){
        Student s = null;
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("select * from students where rollNumber=?");
            st.setInt(1, rollNumber);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                s = new Student();
                s.setRollNumber(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setGender(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setMobileNumber(rs.getString(5));
                s.setCourse(rs.getString(6));
            }
            rs.close();
        }
        catch(Exception ex){            
        }    
        return s;
    }    
    public static ArrayList<Student> getAllStudents(){
        ArrayList<Student> list = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("select * from students");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setRollNumber(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setGender(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setMobileNumber(rs.getString(5));
                s.setCourse(rs.getString(6));
                list.add(s);
            }
            rs.close();
        }
        catch(Exception ex){            
        }    
        return list;
    }    
    public static ArrayList<Student> getAllStudentsByCourse(String course){
        ArrayList<Student> list = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("select * from students where Course=?");
            st.setString(1, course);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setRollNumber(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setGender(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setMobileNumber(rs.getString(5));
                s.setCourse(rs.getString(6));
                list.add(s);
            }
            rs.close();
        }
        catch(Exception ex){            
        }    
        return list;
    }
    public static ArrayList<Student> getAllStudentsByName(String name){
        ArrayList<Student> list = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD)){           
            PreparedStatement st = conn.prepareStatement("select * from students where Name like ?");
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setRollNumber(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setGender(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setMobileNumber(rs.getString(5));
                s.setCourse(rs.getString(6));
                list.add(s);
            }
            rs.close();
        }
        catch(Exception ex){            
        }    
        return list;
    } 
}
    