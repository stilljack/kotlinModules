package com.example.codecollections.misc_hacker_rank_answers

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val finalGrades = arrayListOf<Int>()
    for (i in grades.indices) {
        if (grades[i] <= 37){
            finalGrades.add(grades[i])
        }
        else {
            if(grades[i] % 5 == 3) {
                finalGrades.add(grades[i]+2)
            }
            else if(grades[i] % 5 == 4) {
                finalGrades.add(grades[i]+1)
            }
            else {
                finalGrades.add(grades[i])
            }
        }
    }
    val finalArray = arrayOfNulls<Int>(finalGrades.size)
    finalGrades.toArray(finalArray)
    return finalArray as Array<Int>
}