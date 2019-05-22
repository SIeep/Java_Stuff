<template>
    <div class="test">
        <h1>This is a test page</h1>
        <h1>Text</h1>
        <h1>Message: {{message}}</h1>
<!--        <h1>Name: {{myName}}</h1>-->


            <h1>
                Select the type of Liquor
            </h1>
            <form method="post" action="SelectLiquor">
                <br>
                <select name="Type" size="1">
                    <option>WINE</option>
                    <option>WHISKY</option>
                    <option>BEER</option>

                </select>
                <br><br>
                <input type="submit">
            </form>

    </div>
</template>

<!--<script>-->
<!--    export default {-->
<!--        name: "Test"-->
<!--    }-->
<!--</script>-->

<script>
    import axios from "axios";

    export default {
        data: function() {
            return {
                message: "Welcome to the test page!",
                myName: ""
            };
        },

        created: function() {
            axios.get("/hello").then(response => {
                this.myName = response.data;
            });
        },
        // methods: {
        //     // createPost: function() {
        //     //     var params = {
        //     //         text: this.createText
        //     //     };
        //     //     console.log("creating post...")
        //     //     axios.post('/api/posts', params).then(
        //     //         response => {
        //     //             console.log(response);
        //     //         });
        //     //     location.reload();
        //     },
        // }
    }
</script>

<style scoped>

</style>