/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import spock.lang.Specification

class LargestNumberAtLeastTwiceOfOthersSpec extends Specification {
    def "FindPivotIndex; Return the index where the left and right side of the index have the same sum"() {
        setup: "Convert the List<int> to an array of int values"
        int[] _input = input.toArray()

        expect:
        LargestNumberAtLeastTwiceOfOthers.dominantIndex(_input) == result

        where:
        input        || result
        [3, 6, 1, 0] || 1
        [1, 2, 3, 4] || -1
        [0, 0, 2, 3] || -1
        [0, 1, 1, 2] || 3
        [0, 0, 3, 2] || -1
    }
}