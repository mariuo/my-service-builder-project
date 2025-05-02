BASE_URL="http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry"

USER_EMAIL="test@liferay.com"

FOLDER_ID=0
DESCRIPTION=""
NAME=""
KEY="your-key-here"

echo "Fetching H7G5Entry by H7G5FolderId with permission check..."
curl "$BASE_URL/find-entry-by-folder-id-with-permission-check" \
    -u "$API_USER:$API_PASSWORD" \
    -d h7g5FolderId="$FOLDER_ID" \
    -d userEmailAddress="$USER_EMAIL"

echo "Fetching H7G5Entry by Name with permission check..."
curl "$BASE_URL/find-entry-by-name-with-permission-check" \
    -u "$API_USER:$API_PASSWORD" \
    -d name="$NAME" \
    -d userEmailAddress="$USER_EMAIL"

echo "Fetching H7G5Entry by Key with permission check..."
curl "$BASE_URL/find-entry-by-key-with-permission-check" \
    -u "$API_USER:$API_PASSWORD" \
    -d key="$KEY" \
    -d userEmailAddress="$USER_EMAIL"

echo "Fetching H7G5Entry by H7G5FolderId, Description, and Name with permission check..."
curl "$BASE_URL/find-entry-by-h_-d_-n-with-permission-check" \
    -u "$API_USER:$API_PASSWORD" \
    -d h7g5FolderId="$FOLDER_ID" \
    -d description="$DESCRIPTION" \
    -d name="$NAME" \
    -d userEmailAddress="$USER_EMAIL"