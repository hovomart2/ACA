package week4HomeworkTask1;

public class UserGroup {
    private User[] users;

    public UserGroup() {
        this.users = new User[10];
    }

    public UserGroup(User[] users){
        if(users.length <= 10) {
            this.users = users;
        }
        else{
            System.out.println("Invalid argument");
        }
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void addUser(User user) {
        if (this.users.length < 10) {
            for (int i = 0; i < 10; i++) {
                if (users[i] == null) {
                    users[i] = user;
                }
            }
        } else {
            System.out.println("there is no space in the group");
        }
    }

    @Override
    public UserGroup clone() {
        User[] cloneUsers = new User[10];
        for (int i = 0; i < 10; i++) {
            cloneUsers[i] = this.users[i].clone();
        }
        return new UserGroup(cloneUsers);
    }
}
