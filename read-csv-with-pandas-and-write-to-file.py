import pandas as pd

def get_tweets(filepath:str):
    tweets = pd.read_csv(filepath, nrows=3000)
    return tweets.tweet_text.to_string(index=False)
    
def write_tweets_to_text_file(tweets):
    with open('/ifs_act3_home/rservaites/code/py-pai/data/translation/ira_tweets_text_only.txt', 'w+') as outfile:
        for tweet in tweets:
            outfile.write(tweet)
    outfile.close()
