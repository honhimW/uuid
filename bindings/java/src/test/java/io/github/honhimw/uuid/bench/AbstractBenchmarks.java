package io.github.honhimw.uuid.bench;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * @author honhimW
 * @since 2025-10-09
 */

public abstract class AbstractBenchmarks {

    @Setup(Level.Trial)
    public void setup() {
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
    @Measurement(iterations = 4, time = 1, timeUnit = TimeUnit.SECONDS)
    @Fork(1)
    public void get() throws Exception {
    }

}
