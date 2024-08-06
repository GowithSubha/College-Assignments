# -*- coding: utf-8 -*-
"""Week_3.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1AFzxvWshSdYgDpiqZhbjyVVf6GSHkWJ4

# 1. Write a function called check-season, it takes a month parameter and returns the season: Autumn, Winter, Spring or Summer.
"""

# 1. Write a function called check-season, it takes a month parameter and returns the season: Autumn, Winter, Spring or Summer.
def check_season(month):
  month = month.lower()
  if month in ['september', 'october', 'november']:
    return 'Autumn'
  elif month in ['december', 'january', 'february']:
    return 'Winter'
  elif month in ['march', 'april', 'may']:
    return 'Spring'
  elif month in ['june', 'july', 'august']:
    return 'Summer'
  else:
    return 'Invalid month'

month = input('Enter the month: ')
print(check_season(month))

"""# 2. Write a function called calculate_slope which return the slope of a linear equation"""

# 2. Write a function called calculate_slope which return the slope of a linear equation
def calculate_slope(x1, y1, x2, y2):
  return (y2 - y1) / (x2 - x1)

p1, p2, p3, p4 = map(int, input('Enter the points: ').split())
print(calculate_slope(p1, p2, p3, p4))

"""# 3. Quadratic equation is calculated as follows: ax² + bx + c = 0. Write a function which calculates solution set of a quadratic equation, _solve_quadratic_eqn_."""

# 3. Quadratic equation is calculated as follows: ax² + bx + c = 0. Write a function which calculates solution set of a quadratic equation, _solve_quadratic_eqn_.
import cmath
def _solve_quadratic_eqn(a, b, c):
  d = (b**2) - (4*a*c)
  sol1 = (-b-cmath.sqrt(d))/(2*a)
  sol2 = (-b+cmath.sqrt(d))/(2*a)
  return sol1, sol2


a, b, c = map(int, input('Enter the coefficients: ').split())
print(_solve_quadratic_eqn(a, b, c))

"""# 4. Declare a function named print_list. It takes a list as a parameter and it prints out each element of the list."""

# 4. Declare a function named print_list. It takes a list as a parameter and it prints out each element of the list.
def print_list(lst):
  for i in lst:
    print(i, end=" ")

lst = [1, 2, 3, 4, 5]
print_list(lst)

"""# 5. Declare a function named reverse_list. It takes an array as a parameter and it returns the reverse of the array (use loops)."""

# 5. Declare a function named reverse_list. It takes an array as a parameter and it returns the reverse of the array (use loops).
def reverse_list(lst):
  return lst[::-1]

lst = [1, 2, 3, 4, 5]
print(reverse_list(lst))

"""# 6. Compute the sum up to n terms in the series 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n where n is a positive integer and input by user."""

# 6. Compute the sum up to n terms in the series 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n where n is a positive integer and input by user.
def sum_of_series(n):
  sum = 0
  for i in range(1, n+1):
    if i % 2 == 0:
      sum -= 1/i
    else:
      sum += 1/i
  return sum

n = int(input('Enter the value of n: '))
print(sum_of_series(n))

"""# 7. Write a program to compute sin x for given x. The user should supply x and a positive integer n. We compute the sine of x using the series and the computation should use all terms in the series up through the term involving xn sin x = x - x3/3! + x5/5! - x7/7! + x9/9! ........"""

# 7. Write a program to compute sin x for given x. The user should supply x and a positive integer n. We compute the sine of x using the series and the computation should use all terms in the series up through the term involving xn sin x = x - x3/3! + x5/5! - x7/7! + x9/9! ........
def sin_x(x, n):
  sum = x
  fact = 1
  sign = -1
  for i in range(1, n):
    fact *= (2*i) * (2*i + 1)
    sign *= -1
    sum += (sign * (x ** (2*i + 1))) / fact
  return sum

x, n = map(int, input('Enter the value of x and n: ').split())
print(sin_x(x, n))

"""8. Write a program to compute cosine of x. The user should supply x and a positive integer n.
We compute the cosine of x using the series and the computation should use all terms in the
series up through the term involving xn
cos x = 1 - x2/2! + x4/4! - x6/6! ....
"""

# 8. Write a program to compute cosine of x. The user should supply x and a positive integer n. We compute the cosine of x using the series and the computation should use all terms in the series up through the term involving xn cos x = 1 - x2/2! + x4/4! - x6/6! ....
def cos_x(x, n):
  sum = 1
  fact = 1
  sign = -1
  for i in range(1, n):
    fact *= (2*i) * (2*i + 1)
    sign *= -1
    sum += (sign * (x ** (2*i))) / fact

  return sum

x, n = map(int, input('Enter the value of x and n: ').split())
print(cos_x(x, n))

"""# Print the pattern upto N Lines:                      

![image.png](data:image/png;base64,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)  .


"""

def print_pattern(N):
    for i in range(1, N + 1):
        spaces = N - i

        print(" " * spaces + ".")

        for j in range(1, i + 1):
            if j == i:
                print(" " * (spaces - j + 1) + "/" + "_" * (2 * j - 1) + "\\")
            else:
                print(" " * (spaces - j + 1) + "/" + " " * (2 * j - 1) + "\\")

print("Pattern for N = 2:")
print_pattern(2)
print("\nPattern for N = 3:")
print_pattern(3)
print("\nPattern for N = 4:")
print_pattern(4)

"""![image.png](data:image/png;base64,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)"""

def print_number_segment(number):
    segments = {
        '0': [' - ', '| |', '   ', '| |', ' - '],
        '1': ['   ', '  |', '   ', '  |', '   '],
        '2': [' - ', '  |', ' - ', '|  ', ' - '],
        '3': [' - ', '  |', ' - ', '  |', ' - '],
        '4': ['   ', '| |', ' - ', '  |', '   '],
        '5': [' - ', '|  ', ' - ', '  |', ' - '],
        '6': [' - ', '|  ', ' - ', '| |', ' - '],
        '7': [' - ', '  |', '   ', '  |', '   '],
        '8': [' - ', '| |', ' - ', '| |', ' - '],
        '9': [' - ', '| |', ' - ', '  |', ' - ']
    }

    digits = list(str(number))

    for i in range(5):
        for digit in digits:
            print(segments[digit][i], end=' ')
        print()

print_number_segment(82)

"""Print the pattern upto N lines:
```
1  2  
4  3

# N=2
```



```
1  2  3
8  9  4
7  6  5

# N=3
```
```
 1  2  3  4
12 13 14  5
11 16 15  6
10  9  8  7

# N=4
```



"""

def generate_spiral_matrix(N):

    matrix = [[0]*N for _ in range(N)]


    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    dir_idx = 0
    current_num = 1
    x, y = 0, 0

    for _ in range(N * N):
        matrix[x][y] = current_num
        current_num += 1


        next_x = x + directions[dir_idx][0]
        next_y = y + directions[dir_idx][1]


        if 0 <= next_x < N and 0 <= next_y < N and matrix[next_x][next_y] == 0:
            x, y = next_x, next_y
        else:

            dir_idx = (dir_idx + 1) % 4
            x += directions[dir_idx][0]
            y += directions[dir_idx][1]

    return matrix

def print_spiral_matrix(matrix):
    for row in matrix:
        print("\t".join(map(str, row)))

n = int(input('Enter the value of N: '))
print("Pattern for N = ", n)
print_spiral_matrix(generate_spiral_matrix(n))

"""Write a python script  that displays the following table
```
1 1 1 1 1
2 1 2 4 8
3 1 3 9 27
4 1 4 16 64
5 1 5 25 125
```

"""

def print_table(n):
    print("N\t1\tN\tN^2\tN^3")
    col = n;
    for i in range(1, col+1):
        n = i
        n1 = 1
        n2 = n
        n_square = n ** 2
        n_cube = n ** 3

        print(f"{n}\t{n1}\t{n2}\t{n_square}\t{n_cube}")


n = int(input('Enter the number of column: '))
print_table(n)