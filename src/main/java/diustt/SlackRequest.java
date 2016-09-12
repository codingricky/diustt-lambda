package diustt;

public class SlackRequest {
    String token;
    String teamDomain;
    String channel;
    String userName;
    String command;
    String responseUrl;

    public String getToken() {
        return token;
    }

    public String getTeamDomain() {
        return teamDomain;
    }

    public String getChannel() {
        return channel;
    }

    public String getUserName() {
        return userName;
    }

    public String getCommand() {
        return command;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    @Override
    public String toString() {
        return "SlackRequest{" +
                "token='" + token + '\'' +
                ", teamDomain='" + teamDomain + '\'' +
                ", channel='" + channel + '\'' +
                ", userName='" + userName + '\'' +
                ", command='" + command + '\'' +
                ", responseUrl='" + responseUrl + '\'' +
                '}';
    }
}
