package io.github.honhimw.uuid;

import org.junit.jupiter.api.Test;

/**
 * @author honhimW
 * @since 2025-10-11
 */

public class LoadHelperTests {

    @Test
    void platformTest() {
        LoadHelper.Platform platform = LoadHelper.Platform.getPlatform(System.getProperty("os.name"));
        LoadHelper.Arch arch = LoadHelper.Arch.getArch(System.getProperty("os.arch"));
        assert platform != null : System.getProperty("os.name");
        assert arch != null : System.getProperty("os.arch");
        LoadHelper.Target target = LoadHelper.Target.getTarget(platform, arch);
        assert target != null : System.getProperty("os.name") + " " + System.getProperty("os.arch");
    }

}
