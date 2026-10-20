import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    salaries = employee["salary"].drop_duplicates().sort_values(ascending=False)

    result = salaries.iloc[N - 1] if N > 0 and len(salaries) >= N else None

    return pd.DataFrame({"getNthHighestSalary(" + str(N) + ")": [result]})