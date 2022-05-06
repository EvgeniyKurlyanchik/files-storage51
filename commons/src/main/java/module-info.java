module ru.gb.commons {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.logging;
    requires io.netty.transport;

    exports ru.gb.commons;
    exports ru.gb.commons.Actions;
    exports ru.gb.commons.File;
    exports ru.gb.commons.utils;
}
