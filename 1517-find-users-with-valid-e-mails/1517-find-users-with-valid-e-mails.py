import pandas as pd

def valid_emails(users: pd.DataFrame) -> pd.DataFrame:
    mask = users['mail'].str.contains(r'^[a-zA-Z]{1}[a-zA-Z0-9._-]*@leetcode\.com$', regex=True)
    return users[mask]