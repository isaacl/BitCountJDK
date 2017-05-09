package org.openjdk.jmh.samples

import org.openjdk.jmh.annotations._

import java.util.concurrent.TimeUnit

import org.BitCounts

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class BitCountTest {
  @Benchmark
  def bitCountInt = {
    var i = 0
    var cnt = 0
    val max = 1 << 14
    while (i < max) {
      cnt += BitCounts.bitCountInt(i)
      i += 1
    }
    cnt
  }

  @Benchmark
  def bitCountIntNew = {
    var i = 0
    var cnt = 0
    val max = 1 << 14
    while (i < max) {
      cnt += BitCounts.bitCountIntNew(i)
      i += 1
    }
    cnt
  }

  @Benchmark
  def bitCountLong = {
    var i = 0l
    var cnt = 0
    val max = 1l << 14
    while (i < max) {
      cnt += BitCounts.bitCountLong(i)
      i += 1l
    }
    cnt
  }

  @Benchmark
  def bitCountLongNew = {
    var i = 0l
    var cnt = 0
    val max = 1l << 14
    while (i < max) {
      cnt += BitCounts.bitCountLongNew(i)
      i += 1l
    }
    cnt
  }
}
