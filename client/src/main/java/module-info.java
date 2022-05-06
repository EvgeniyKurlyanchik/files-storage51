module ru.gb.client {
    requires io.netty.all;
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.codec;
    requires lombok;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires io.netty.transport;
    requires ru.gb.commons;
    opens ru.gb.client to javafx.fxml;
    exports ru.gb.client;
}
