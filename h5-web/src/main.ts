import { createApp } from 'vue'
import { createPinia } from 'pinia'
import { Button, Cell, CellGroup, Field, Form, NavBar, NoticeBar, Tabbar, TabbarItem } from 'vant'
import App from './App.vue'
import router from './router'
import './assets/main.css'
import 'vant/lib/index.css'

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(Button)
app.use(Cell)
app.use(CellGroup)
app.use(Field)
app.use(Form)
app.use(NavBar)
app.use(NoticeBar)
app.use(Tabbar)
app.use(TabbarItem)

app.mount('#app')
