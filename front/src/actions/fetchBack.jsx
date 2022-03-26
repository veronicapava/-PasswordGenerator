export const fetchBack = (state) => (dispatch) => {
    dispatch({type: "view-loading"})

    const baseUrl = "http://localhost:8100/"
    const endPoint = "post"
    return fetch(baseUrl + endPoint,{
            method: "POST",
            headers: {"Content-Type": "application/json" },
            body: JSON.stringify({size: state})
        }).then(response => response.json())
        .then(json => {
            dispatch({ type: "random-result", data: json });
            dispatch({ type: "view-loaded" });
          })
}

