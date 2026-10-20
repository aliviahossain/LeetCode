import pandas as pd

def valid_emails(users: pd.DataFrame) -> pd.DataFrame:
    pattern = r'^[A-Za-z][A-Za-z0-9_.-]*@leetcode\.com$'
    return users.loc[
        users["mail"].str.match(pattern),
        ["user_id", "name", "mail"]
    ]