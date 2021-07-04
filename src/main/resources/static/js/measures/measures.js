'use strict';

const e = React.createElement;

class LikeButton extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            data: []
        };
    }

    componentDidMount() {
        axios.get('/api/measures')
            .then(
                (result) => {
                    const data = result.data;
                    this.setState({ error: null, data: data, isLoaded: true });
                },
                (error) => {
                    this.setState({ error: error})
                }
            )
    }

    render() {
        const { error, isLoaded, data } = this.state;
        if (error) {
            return e('div', null, 'Error ' + error);
        }
        if (!isLoaded) {
            return e('div', null, 'Please wait');
        }

        return e('div', null,
            e('ul', null,
                ...data.items.map(it => (
                    e('li', null, it.measureValue)
                ))
            )
        )
    }
}

ReactDOM.render(
    e(LikeButton),
    document.querySelector('#itemsList')
);
