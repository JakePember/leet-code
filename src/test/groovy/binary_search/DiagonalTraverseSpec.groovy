package binary_search
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


import binary_search.PlusOne
import spock.lang.Specification

class DiagonalTraverseSpec extends Specification {
    def "Given a matrix, return all elements of the matrix in a diagonal order"() {
        setup: "create the input since the syntax is not working in where clause"
        int[][] input = getMatrix(matrixId);

        expect:
        DiagonalTraverse.findDiagonalOrder(input) == results;

        where:
        matrixId | results
        1        | [-1]

    }

    def int[][] getMatrix(int _matrixNum) {
        switch(_matrixNum) {
            case 1:
                return [
                        [1,2,3],
                        [4,5,6],
                        [7,8,9]
                ]

        }
    }
}