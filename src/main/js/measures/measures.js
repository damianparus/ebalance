'use strict';

const e = React.createElement;

class MeasuresList extends React.Component {

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
            return <div>Error: {error}</div>
        }
        if (!isLoaded) {
            return <div>Please wait</div>
        }

        return (
            <div>
                {data.items.map(function (d, idx) {
                    return (<li key={idx}>{d.measureValue}</li>)
                })}
            </div>
        )
    }
}

ReactDOM.render(
    e(MeasuresList),
    document.querySelector('#itemsList')
);
