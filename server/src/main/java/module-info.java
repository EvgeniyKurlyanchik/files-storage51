module ru.gb.server {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;
    requires jbcrypt;
    requires ru.gb.commons;
    requires org.xerial.sqlitejdbc;
    requires io.netty.transport;
    requires io.netty.codec;
    requires org.slf4j;
    opens ru.gb to javafx.fxml;
    exports ru.gb.server;
}
