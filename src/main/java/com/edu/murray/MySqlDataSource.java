package com.edu.murray;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author hp
 */

@Component
@ConfigurationProperties("datasource")
public class MySqlDataSource {
    private String url;
    private String user;
    private String password;
    private String driver;

    @Override
    public String toString() {
        return "MySqlDataSource{" +
                "url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDataSource)) {
            return false;
        }
        MySqlDataSource that = (MySqlDataSource) o;
        return Objects.equals(getUrl(), that.getUrl()) && Objects.equals(getUser(), that.getUser()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getDriver(), that.getDriver());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUrl(), getUser(), getPassword(), getDriver());
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
