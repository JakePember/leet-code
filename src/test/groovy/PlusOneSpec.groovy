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

class PlusOneSpec extends Specification {
    def "FindPivotIndex; Return the index where the left and right side of the index have the same sum"() {
        setup: "Convert the List<int> to an array of int values"
        int[] _input = input.toArray()
        int[] _result = result.toArray()

        expect:
        PlusOne.plusOne(_input) == _result

        where:
        input                          || result
        [1, 2, 3]                      || [1, 2, 4]
        [9]                            || [1, 0]
        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] || [9, 8, 7, 6, 5, 4, 3, 2, 1, 1]
    }
}